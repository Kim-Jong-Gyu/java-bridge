package bridge;

import controller.Util;
import model.*;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private Util util;
    private User user;

    private Bridge bridge;

    private Result result;

    public void run(){

    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
        String moving = util.inputMoving();
        user.setCurrentMoving(moving);
        user.addMovingRoute(moving);
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {

    }

    public void enterResult(){
        String movingResult = compareBridge();
        result.setCurrentResult(movingResult);
        result.addMovingResult(movingResult);
    }

    private String compareBridge(){
        int currentLocation = user.getMovingRoute().size();
        if(user.getCurrentMoving().equals(bridge.getAnswer(currentLocation)))
            return "O";
        return "X";
    }
}
