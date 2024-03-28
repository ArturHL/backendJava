package com.malu.antojitos_malu.DataBase.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

import com.malu.antojitos_malu.Domain.DTO.BookingDTO;
import com.malu.antojitos_malu.DataBase.Entities.Reserva;

@Mapper(componentModel = "spring")
public interface BookingMapper {
  @Mappings({
    @Mapping(target = "id", source = "idReserva"),
    @Mapping(target = "userId", source = "idUsuario"),
    @Mapping(target = "date", source = "fecha"),
    @Mapping(target = "attendees", source = "personasAsistentes"),
  })
  BookingDTO toBookingDTO(Reserva reserva);
  List<BookingDTO> toBookingsDTOs(List<Reserva> reservas);

  @InheritInverseConfiguration
  Reserva toReserva(BookingDTO bookingDTO);
}
