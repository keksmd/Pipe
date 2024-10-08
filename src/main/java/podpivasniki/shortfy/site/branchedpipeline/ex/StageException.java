package podpivasniki.shortfy.site.branchedpipeline.ex;

import podpivasniki.shortfy.site.branchedpipeline.enums.StagePhases;
import lombok.Data;

@Data
public class StageException extends RuntimeException{
    private final StagePhases stagePhase;

    public StageException(StagePhases stagePhase) {
        super();
        this.stagePhase = stagePhase;
    }

    public StageException(String message,StagePhases stagePhase) {
        super(message);
        this.stagePhase = stagePhase;
    }

    public StageException(String message, Throwable cause,StagePhases stagePhase) {
        super(message, cause);
        this.stagePhase = stagePhase;
    }
}
