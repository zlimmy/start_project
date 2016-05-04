package com.huimodel.api.base;

public class PlatformPromAwards {
	// 奖项 几等级奖 代码写死
		private String awards;

		private Integer num;
		// 奖品
		private PlatformPrize prize;
		// 是否能够中奖 1 有概率中 0都不能中
		private Integer prize_winning;

		private String pic_url;

		public String getAwards() {
			return awards;
		}

		public void setAwards(String awards) {
			this.awards = awards;
		}

		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public PlatformPrize getPrize() {
			return prize;
		}

		public void setPrize(PlatformPrize prize) {
			this.prize = prize;
		}

		public Integer getPrize_winning() {
			return prize_winning;
		}

		public void setPrize_winning(Integer prize_winning) {
			this.prize_winning = prize_winning;
		}

		public String getPic_url() {
			return pic_url;
		}

		public void setPic_url(String pic_url) {
			this.pic_url = pic_url;
		}

	}