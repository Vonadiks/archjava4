public abstract class Zags {
    protected CivilStatusRecord record;

    public Zags(CivilStatusRecord record) {
        this.record = record;
    }
    abstract CivilStatusRecord createRecord();
}
