package view;

import model.Car;

public class Print {

    public void setCarsQuestion(){
        System.out.println("자동차 대수는 몇 대 인가요?");
    }

    public void setTryQuestion(){
        System.out.println("시도할 회수는 몇 회 인가요?");
    }

    public void result(){
        System.out.println("실행 결과");
    }

    public void carsPosition(Car[] cars){
        for(int i = 0; i < cars.length; i++){
            carPosition(cars[i]);
        }
    }

    public void carPosition(Car car){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < car.getPosition(); i++){
            sb.append("-");
        }

        System.out.println(sb);
    }
}
