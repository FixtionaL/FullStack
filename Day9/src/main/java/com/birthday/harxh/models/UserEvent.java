package com.birthday.harxh.models;
import static jakarta.persistence.GenerationType.*;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event_details")
public class UserEvent {
    @Id
    @GeneratedValue(strategy = UUID)
    private String eventid;

    @Column
    private String eventname;

    @Column
    private String eventdestination;

    @Column
    private String price;

    @Column
    private Long maxparticipants;

}
