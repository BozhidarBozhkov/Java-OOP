package InterfacesAndAbstraction.Exercise.MilitaryElite;

public class Mission {

    private String codeName;
    private MissionState state;

    public Mission(String codeName, MissionState state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public MissionState getState() {
        return state;
    }

    public void setState(MissionState state) {
        this.state = state;
    }

    public void completeMission() {
        setState(MissionState.finished);
    }

    @Override
    public String toString() {

        return String.format("Code Name: %s State: %s", codeName, state);
    }
}
