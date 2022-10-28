package com.nelson.springbootmaverick.service;

import com.nelson.springbootmaverick.dto.MaverickDto;

import java.util.List;

public interface MaverickService {

    MaverickDto save(MaverickDto maverickDto);

    List<MaverickDto> getAll();
}
