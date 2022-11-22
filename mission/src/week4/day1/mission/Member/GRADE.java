package week4.day1.mission.Member;

import week4.day1.mission.counselor.BasicCounselor;
import week4.day1.mission.counselor.Counselor;
import week4.day1.mission.counselor.ProfessionalCounselor;

public enum GRADE {
    SILVER(0, 0.01, 3000, new BasicCounselor()),
    VIP(0.05, 0.05, 1000, new BasicCounselor()),
    PLATINUM(0.1, 0.1,0, new ProfessionalCounselor());

    private final double saleRate;
    private final double pointRate;
    private final int parkingFee;
    private final Counselor counselor;

    GRADE(double saleRate, double pointRate, int parkingFee, Counselor counselor) {
        this.saleRate = saleRate;
        this.pointRate = pointRate;
        this.parkingFee = parkingFee;
        this.counselor = counselor;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public double getPointRate() {
        return pointRate;
    }

    public int getParkingFee() {
        return parkingFee;
    }

    public Counselor getCounselor() {
        return counselor;
    }
}
