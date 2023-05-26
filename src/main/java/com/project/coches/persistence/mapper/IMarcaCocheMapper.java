package com.project.coches.persistence.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistence.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de MarcaCoche a pojo o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {

    /**
     * Convierte una entidad marcaCoche a pojo de mnarcaCoche
     * @param marcaEntity Entidad a convertir
     * @return Pojo a convertir
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

    /**
     * Convierte un pojo de marcaCoche una entidad marcaCoche
     * @param marcaPojo Pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    /**
     *  Retorna una lista de marcaCoche tramfomada a pollo, de una lista de entidades.
     * @param marcasCocheEntity entidad a transformar
     * @return Lista Tranformada.
     */
    List<MarcaCochePojo> toMarcaCochePojo(List<MarcaCocheEntity> marcasCocheEntity);

}
