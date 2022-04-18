package com.huwdunnit.snookerimprover.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.Objects;

/**
 * Models a score for a practise routine, stored in the DB.
 *
 * @author Huwdunnit
 */
@Entity
public class Score {

    @PrimaryKey (autoGenerate = true)
    private int id;

    private String routineName;

    private int score;

    private Date dateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", routineName='" + routineName + '\'' +
                ", score=" + score +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score1 = (Score) o;
        return id == score1.id && score == score1.score && Objects.equals(routineName, score1.routineName) && Objects.equals(dateTime, score1.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, routineName, score, dateTime);
    }
}