package com.uyoobonga.springmvc.service;

import com.uyoobonga.springmvc.dto.ClubDto;
import com.uyoobonga.springmvc.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

        void updateClub(ClubDto clubDto);
}
