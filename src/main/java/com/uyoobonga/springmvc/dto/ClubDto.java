package com.uyoobonga.springmvc.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {
    private Long id;
    @NotEmpty(message = "clubs Title should not be empty")
    private String title;
    @NotEmpty(message = "Photo should not be empty")
    private String photo;
    @NotEmpty(message = "Content should not be empty")
    private String content;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
