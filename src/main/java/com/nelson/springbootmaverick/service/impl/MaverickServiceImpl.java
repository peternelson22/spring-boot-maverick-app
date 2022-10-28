package com.nelson.springbootmaverick.service.impl;

import com.nelson.springbootmaverick.dto.MaverickDto;
import com.nelson.springbootmaverick.exception.SpringMaverickException;
import com.nelson.springbootmaverick.mapper.MaverickMapper;
import com.nelson.springbootmaverick.model.Maverick;
import com.nelson.springbootmaverick.repository.MaverickRepository;
import com.nelson.springbootmaverick.service.MaverickService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class MaverickServiceImpl implements MaverickService {

    private MaverickRepository maverickRepository;
    private MaverickMapper maverickMapper;


    @Transactional
    public MaverickDto save(MaverickDto maverickDto) {
        Maverick save = maverickRepository.save(maverickMapper.mapDtoToMaverick(maverickDto));
        maverickDto.setId(save.getId());
        return maverickDto;
    }

    @Transactional(readOnly = true)
    public List<MaverickDto> getAll() {
        return maverickRepository.findAll()
                .stream()
                .map(maverickMapper::mapMaverickToDto)
                .collect(toList());
    }

    public MaverickDto getSubreddit(Long id) {
        Maverick subreddit = maverickRepository.findById(id)
                .orElseThrow(() -> new SpringMaverickException("No subreddit found with ID - " + id));
        return maverickMapper.mapMaverickToDto(subreddit);
    }


    /*@Override
    public MaverickDto save(MaverickDto maverickDto) {
        Maverick maverick = maverickRepository.save(mapMaverickDto(maverickDto));
        maverickDto.setId(maverick.getId());
        return maverickDto;
    }

    @Override
    public List<MaverickDto> getAll() {
        return maverickRepository.findAll().stream()
                .map(this::mapTODto)
                .collect(Collectors.toList());
    }

    private MaverickDto mapTODto(Maverick maverick) {
        return MaverickDto.builder()
                .name(maverick.getName())
                .numberOfPosts(maverick.getPosts().size())
                .id(maverick.getId())
                .build();
    }

    private Maverick mapMaverickDto(MaverickDto maverickDto) {
       return Maverick.builder()
                .name(maverickDto.getName())
                .description(maverickDto.getDescription())
                .build();
    }*/
}
