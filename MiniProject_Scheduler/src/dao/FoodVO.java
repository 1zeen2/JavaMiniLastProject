package dao;

import lombok.Data;

@Data
public class FoodVO {
	private int fno, no;
	private double score;
	private String name, address, phone, theme, type, price, time, seat, content, poster, link;
}