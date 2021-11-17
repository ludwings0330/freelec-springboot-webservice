package com.ludwings.book.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() throws Exception {
        //given
        String name = "test";
        int age = 29;
        //when
        HelloResponseDto dto = new HelloResponseDto(name, age);
        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAge()).isEqualTo(age);
    }
}