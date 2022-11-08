package HealthCareWorker;

import java.util.LinkedHashSet;

import I_HealthCareWorker.HealthcareServiceable;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private LinkedHashSet<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        this.members = new LinkedHashSet<>();
    }

    public void addMember(HealthcareServiceable member) {
        this.members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        this.members.remove(member);
    }

    public void service() {
        for (HealthcareServiceable member: members) {
            member.service();
        }
    }

    public double getPrice() {
        double sum = 0.0;
        for (HealthcareServiceable member: members) {
            sum += member.getPrice();
        }
        return sum;
    }
}
