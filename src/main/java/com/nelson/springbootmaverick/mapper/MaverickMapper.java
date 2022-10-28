package com.nelson.springbootmaverick.mapper;

import com.nelson.springbootmaverick.dto.MaverickDto;
import com.nelson.springbootmaverick.model.Maverick;
import com.nelson.springbootmaverick.model.Post;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaverickMapper {

    @Mapping(target = "numberOfPosts", expression = "java(mapPosts(maverick.getPosts()))")
    MaverickDto mapMaverickToDto(Maverick maverick);

    default Integer mapPosts(List<Post> numberOfPosts) {
        return numberOfPosts.size();
    }

    @InheritInverseConfiguration
    @Mapping(target = "posts", ignore = true)
    Maverick mapDtoToMaverick(MaverickDto maverickDto);
}


