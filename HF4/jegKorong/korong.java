package jegKorong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class korong implements Comparable<korong> {

    private String csapatNev;
    public int pontDb;
    public int golDb;

    public korong(String csapatNev, int pontDb, int golDb) {
        this.csapatNev = csapatNev;
        this.pontDb = pontDb;
        this.golDb = golDb;
    }

    public String getCsapatNev() {
        return csapatNev;
    }

    public int getPontDb() {
        return pontDb;
    }

    public int getGolDb() {
        return golDb;
    }

    @Override
    public String toString() {
        return csapatNev + ": " + pontDb + " points (" + golDb + " scored goals)";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof korong)) {
            return false;
        }
        korong k = (korong) obj;
        return this.csapatNev.equals(k.getCsapatNev());

    }

    @Override
    public int compareTo(korong o) {

        int diff = Integer.compare(o.getPontDb(), this.pontDb);
        if (diff != 0) {
            return diff;
        }
        return this.csapatNev.compareTo(o.getCsapatNev());
    }

}

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String[] s = null;
        List<korong> klist = new ArrayList<>();

        while (!(sor = sc.nextLine()).equals("vege")) {
            s = sor.split(":");
            String[] token = s[0].split("-");

            String[] points = s[1].split("[,-]");

            boolean listaban = false;

            for (int i = 0; i < klist.size(); i++) {
                if (klist.get(i).getCsapatNev().equals(token[0])) {
                    listaban = true;
                }
            }
            if (listaban == false) {
                klist.add(new korong(token[0], 0, 0));
            }

            listaban = false;

            for (int i = 0; i < klist.size(); i++) {
                if (klist.get(i).getCsapatNev().equals(token[1])) {
                    listaban = true;
                }
            }

            if (listaban == false) {
                klist.add(new korong(token[1], 0, 0));
            }

            int csapat1 = 0;
            int csapat2 = 0;
            for (int i = 0; i < points.length; i++) {

                if (i % 2 == 0) {
                    csapat1 += Integer.parseInt(points[i]);
                } else {
                    csapat2 += Integer.parseInt(points[i]);
                }
            }

            if (csapat1 > csapat2 && points.length <= 6) {
                csapat1 = 3;
                csapat2 = 0;
            } else if (csapat1 > csapat2 && points.length > 6) {
                csapat1 = 2;
                csapat2 = 1;
            } else if (csapat1 < csapat2 && points.length <= 6) {
                csapat2 = 3;
                csapat1 = 0;
            } else if (csapat1 < csapat2 && points.length > 6) {
                csapat1 = 1;
                csapat2 = 2;
            }

            for (int i = 0; i < klist.size(); i++) {
                if (klist.get(i).getCsapatNev().equals(token[0])) {
                    klist.get(i).pontDb += csapat1;
                    for (int j = 0; j < points.length; j++) {
                        if (j % 2 == 0) {
                            klist.get(i).golDb += Integer.parseInt(points[j]);
                        }
                    }

                }
            }

            for (int i = 0; i < klist.size(); i++) {
                if (klist.get(i).getCsapatNev().equals(token[1])) {
                    klist.get(i).pontDb += csapat2;
                    for (int j = 0; j < points.length; j++) {
                        if (j % 2 != 0) {
                            klist.get(i).golDb += Integer.parseInt(points[j]);
                        }
                    }

                }
            }

        }
        Collections.sort(klist);
        for (korong j : klist) {
            System.out.println(j.toString());
        }

    }

}
