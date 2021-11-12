package models;

public class SwapiResponse {
    private Integer count;
    private String next;
    private Species[] results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Species[] getResults() {
        return results;
    }

    public void setResults(Species[] results) {
        this.results = results;
    }

}
