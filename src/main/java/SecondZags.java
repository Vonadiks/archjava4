public class SecondZags extends Zags{
    public SecondZags(CivilStatusRecord record) {
        super(record);
    }

    @Override
    CivilStatusRecord createRecord() {
        System.out.println("SecondZags created record");
        return record;
    }

}
