package racingGame.Service;

import racingGame.model.CarDto;
import racingGame.utils.RandomGenerator;

import java.util.stream.IntStream;

public class CarService {

    private CarDto[] carDtos;

    private static final int RANDOM_MAX = 10;
    private static final int MOVE_BOUNDARY = 4;

    public CarDto[] makeCars(String[] carNames) {

        return carDtos = IntStream.range(0, carNames.length)
                .mapToObj(i -> new CarDto(carNames[i]))
                .toArray(CarDto[]::new);
    }

    public void moveCars(){
        for(CarDto carDto : carDtos){
            move(carDto , RandomGenerator.getNumber(RANDOM_MAX));
        }
    }
    public void move(CarDto carDto, int randomNumber) {
        if (isMove(randomNumber)) {
            carDto.setPosition(carDto.getPosition() + carDto.getSpeed());
        }
    }

    public boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }
    public CarDto[] getCars(){
        return carDtos;
    }

}
