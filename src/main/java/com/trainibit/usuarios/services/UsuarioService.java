package com.trainibit.usuarios.services;

import com.trainibit.usuarios.model.Usuario;
import com.trainibit.usuarios.repository.UsuarioRepository;
import com.trainibit.usuarios.response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.*;

import static org.springframework.util.ClassUtils.isPresent;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponse> findAll() {
        List<Usuario> listUsuarios= usuarioRepository.findAll();
        List<UsuarioResponse> ListaUsuarioResponse= new ArrayList<>();
        for (Usuario usuario : listUsuarios) {
            UsuarioResponse usuarioTmp = mappingEntityToResponse(usuario);
            ListaUsuarioResponse.add(usuarioTmp);
        }
        return ListaUsuarioResponse;
    }

    public UsuarioResponse findByUuid(UUID uuid) throws ResourceAccessException {
        Usuario usuario = usuarioRepository.findByUuid((uuid))
                .orElseThrow(() -> new ResourceAccessException("Usuario not found for this id:: " + uuid));
        UsuarioResponse usuarioTmp = mappingEntityToResponse(usuario);
        usuarioTmp.setEdad(calcularEdad(usuarioTmp.getFechaNacimiento()));
        return usuarioTmp;
    }

    public Boolean autenticar(String usarName, String password) throws ResourceAccessException {
        Optional<Usuario> usuario = usuarioRepository.findByNomUsuarioAndPassword(usarName,password);
        return usuario.isPresent();
    }
    private UsuarioResponse mappingEntityToResponse(Usuario usuario) {
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setNombre(usuario.getNombre());
        usuarioResponse.setNumEmpleado(usuario.getNumEmpleado());
        usuarioResponse.setFechaNacimiento(usuario.getFechaNacimiento());
        usuarioResponse.setFechaUltimoAccesso(usuario.getFechaUltimoAccesso());
        usuarioResponse.setPuesto(usuario.getPuesto());
        usuarioResponse.setIndActivo(usuario.getIndActivo());
        usuarioResponse.setNomUsuario(usuario.getNomUsuario());
        usuarioResponse.setUuid(usuario.getUuid());
        return usuarioResponse;
    }


    // Metodo para convertir Date a LocalDatΩ
    private LocalDate convertDateToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        gregorianCalendar.setTime(date);
        ZonedDateTime zonedDateTime = gregorianCalendar.toZonedDateTime();
        return zonedDateTime.toLocalDate();
    }


    //Operacion de calcular edad
    private Integer calcularEdad(Date fechaNacimiento){
        LocalDate nacimiento = convertDateToLocalDate(fechaNacimiento);
        if (fechaNacimiento != null) {
            LocalDate hoy = LocalDate.now();
            Period periodo = Period.between(nacimiento, hoy);
            return periodo.getYears();
        }
        return null;
    }

    //Operacion pasar Mayus
    private String pasarMayusculas(String nombre) {
        return nombre.toUpperCase();
    }

    //Operacion concatenar
    private String concatPuestoNombre(String puesto, String nombre) {
        return puesto + " " + nombre;
    }

}
