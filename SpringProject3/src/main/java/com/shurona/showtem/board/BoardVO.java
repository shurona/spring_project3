package com.shurona.showtem.board;

public class BoardVO {
	
	/*
	CREATE TABLE `itemlist` (
			`id` INT(10) NOT NULL AUTO_INCREMENT,
			`RANK` INT(1) NULL DEFAULT NULL,
			`BF_Sword` INT(1) NULL DEFAULT NULL,
			`Giant_Belt` INT(1) NOT NULL,
			`Recurve_Bow` INT(1) NULL DEFAULT NULL,
			`Spatula` INT(1) NULL DEFAULT NULL,
			`Chain_Vest` INT(1) NULL DEFAULT NULL,
			`Large_Rod` INT(1) NULL DEFAULT NULL,
			`Tear_OF_THE_Goddess` INT(1) NULL DEFAULT NULL,
			`Sparring_Gloves` INT(1) NULL DEFAULT NULL,
			`Negatron_Cloak` INT(1) NULL DEFAULT NULL,
			`Johab` VARCHAR(15) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
			PRIMARY KEY (`id`) USING BTREE
		)
	*/

	private int id;
	private int rank;
	private int bf_sword;
	private int giant_belt;
	private int recurve_bow;
	private int spatula;
	private int chain_vest;
	private int large_rod;
	private int tear_of_the_goddess;
	private int sparring_gloves;
	private int negatron_cloak;
	private String johab;
	private int sim;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getBf_sword() {
		return bf_sword;
	}
	public void setBf_sword(int bf_sword) {
		this.bf_sword = bf_sword;
	}
	public int getGiant_belt() {
		return giant_belt;
	}
	public void setGiant_belt(int giant_belt) {
		this.giant_belt = giant_belt;
	}
	public int getRecurve_bow() {
		return recurve_bow;
	}
	public void setRecurve_bow(int recurve_bow) {
		this.recurve_bow = recurve_bow;
	}
	public int getSpatula() {
		return spatula;
	}
	public void setSpatula(int spatula) {
		this.spatula = spatula;
	}
	public int getChain_vest() {
		return chain_vest;
	}
	public void setChain_vest(int chain_vest) {
		this.chain_vest = chain_vest;
	}
	public int getLarge_rod() {
		return large_rod;
	}
	public void setLarge_rod(int large_rod) {
		this.large_rod = large_rod;
	}
	public int getTear_of_the_goddess() {
		return tear_of_the_goddess;
	}
	public void setTear_of_the_goddess(int tear_of_the_goddess) {
		this.tear_of_the_goddess = tear_of_the_goddess;
	}
	public int getSparring_gloves() {
		return sparring_gloves;
	}
	public void setSparring_gloves(int sparring_gloves) {
		this.sparring_gloves = sparring_gloves;
	}
	public int getNegatron_cloak() {
		return negatron_cloak;
	}
	public void setNegatron_cloak(int negatron_cloak) {
		this.negatron_cloak = negatron_cloak;
	}
	public String getJohab() {
		return johab;
	}
	public void setJohab(String johab) {
		this.johab = johab;
	}
	public int getSim() {
		return sim;
	}
	public void setSim(int sim) {
		this.sim = sim;
	}
	
	
	
	
}
