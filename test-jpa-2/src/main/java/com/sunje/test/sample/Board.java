package com.sunje.test.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Board {
    @Id
    private int c1;
    
    @Column
    private String c2;
    private int c3;
    private int c4;
    private int c5;
    private int c6;
private int c7;
    private int c8;
    private int c9;
    private String c10;
    
    public int getC1() {
        return c1;
    }
    public void setC1(int c1) {
        this.c1 = c1;
    }
    
    public String getC2() {
        return c2;
    }
    public void setC2(String c2) {
        this.c2 = c2;
    }    
    
    public int getC3() {
        return c3;
    }
    public void setC3(int c3) {
        this.c3 = c3;
    }
    
    public int getC4() {
        return c4;
    }
    public void setC4(int c4) {
        this.c4 = c4;
    }    
    
    public int getC5() {
        return c5;
    }
    public void setC5(int c5) {
        this.c5 = c5;
    }    
    
	public int getC6() {
		return c6;
	}
	public void setC6(int c6) {
		this.c6 = c6;
	}

	public int getC7() {
		return c7;
	}
	public void setC7(int c7) {
		this.c7 = c7;
	}

	public int getC8() {
		return c8;
	}
	public void setC8(int c8) {
		this.c8 = c8;
	}

	public int getC9() {
		return c9;
	}
	public void setC9(int c9) {
		this.c9 = c9;
	}

	public String getC10() {
		return c10;
	}
	public void setC10(String c10) {
		this.c10 = c10;
	}
    
    public Board() {
        super();
    }

    public Board(int c1, String c2, int c3, int c4, int c5, int c6, int c7, int c8, int c9, String c10) {
        super();
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
        this.c9 = c9;
        this.c10 = c10;
    }

    @Override
    public String toString() {
        return "["+c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6+" "+c7+" "+c8+" "+c9+" "+c10+"]";
    }
}

