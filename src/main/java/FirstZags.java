public class FirstZags extends Zags{

    public FirstZags(CivilStatusRecord record) {
        super(record);
    }

    @Override
    CivilStatusRecord createRecord() {
        System.out.println("FirsZags created record");
        return record;
    }
}
