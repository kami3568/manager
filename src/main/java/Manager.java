public class Manager {

    private String[] films = new String[0];
    private int limited;

    public Manager() {
        limited = 10;

    }

    public Manager(int limited) {
        this.limited = limited;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {

        int resultLength;
        if (limited < films.length) {
            resultLength = limited;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {

            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}



