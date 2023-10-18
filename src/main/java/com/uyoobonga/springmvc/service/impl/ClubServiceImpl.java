package com.uyoobonga.springmvc.service.impl;

import com.uyoobonga.springmvc.dto.ClubDto;
import com.uyoobonga.springmvc.models.Club;
import com.uyoobonga.springmvc.repository.ClubRepository;
import com.uyoobonga.springmvc.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    protected ClubRepository  clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = this.clubRepository.findAll();
        return clubs.stream().map(this::mapToClubDto).collect(Collectors.toList());
    }

    @Override
    public Club saveClub(ClubDto clubDto) {
        Club club = mapToClub(clubDto);
        return this.clubRepository.save(club);
    }

    @Override
    public void updateClub(ClubDto clubDto) {
        Club club = mapToClub(clubDto);
        this.clubRepository.save(club);
    }

    @Override
    public ClubDto findClubById(Long id) {
        Club club = this.clubRepository.findById(id).get();
        return mapToClubDto(club);
    }

    private Club mapToClub(ClubDto club) {
        return Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photo(club.getPhoto())
                .content(club.getContent())
                .createAt(club.getCreateAt())
                .updateAt(club.getUpdateAt())
                .build();
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photo(club.getPhoto())
                .content(club.getContent())
                .createAt(club.getCreateAt())
                .updateAt(club.getUpdateAt())
                .build();

        return clubDto;
    }
}
