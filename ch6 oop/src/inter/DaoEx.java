package inter;

interface DataAccessObject {
    public void select();

    public void insert();

    public void update();

    public void delete();

}

class OracleDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

class MysglDao implements DataAccessObject {

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

public class DaoEx {
    public static void main(String[] args) {
        dbwork(new OracleDao());
        dbwork(new MysglDao());

    }

    static void dbwork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
