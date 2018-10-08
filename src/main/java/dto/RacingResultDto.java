package dto;

import domain.RacingResult;

import java.util.*;

public class RacingResultDto {
    private RacingResult racingResult;

    public RacingResultDto(RacingResult racingResult) {
        this.racingResult = racingResult;
    }

    public String getWinners() {
        return racingResult.getWinners();
    }

    public List<CarDto> getCars() {
        return racingResult.getCars();
    }
}
