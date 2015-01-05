package com.linj.imageloader;

import com.linj.imageloader.displayer.BitmapDisplayer;








public class DisplayImageOptions {
	
	public int imageResOnLoading;
	public int imageResOnFail;
	public boolean cacheInMemory;
	public boolean cacheOnDisk;
	public BitmapDisplayer displayer;
	
	private DisplayImageOptions(Builder builder) {
		this.imageResOnLoading=builder.imageResOnLoading;
		this.imageResOnFail=builder.imageResOnFail;
		this.cacheInMemory=builder.cacheInMemory;
		this.cacheOnDisk=builder.cacheOnDisk;
		this.displayer=builder.displayer;
	}

	public static class Builder{
		
		private int imageResOnLoading;
		private int imageResOnFail;
		private boolean cacheInMemory;
		private boolean cacheOnDisk;
		private BitmapDisplayer displayer;
		/**
		 * ���� ����ͼƬ����ʾ��ͼƬ
		 * @param imageRes ͼƬID
		 * @return
		 */
		public Builder showImageOnLoading(int imageRes) {
			this.imageResOnLoading = imageRes;
			return this;
		}
		/**
		 * ���ü���ͼƬʧ����ʾ��ͼƬ
		 * @param imageRes ͼƬID
		 * @return
		 */
		public Builder showImageOnFail(int imageRes) {
			this.imageResOnFail = imageRes;
			return this;
		}
		/**
		 * �����Ƿ����ڴ��л���
		 * @param cacheInMemory 
		 * @return
		 */
		public Builder cacheInMemory(boolean cacheInMemory) {
			this.cacheInMemory = cacheInMemory;
			return this;
		}
		/**
		 * �����Ƿ���sd���ϻ���
		 * @param cacheOnDisk
		 * @return
		 */
		public Builder cacheOnDisk(boolean cacheOnDisk) {
			this.cacheOnDisk = cacheOnDisk;
			return this;
		}
		/**
		 * ͼƬ��ʾ��
		 * @param displayer
		 * @return
		 */
		public Builder displayer(BitmapDisplayer displayer) {
			if (displayer == null) throw new IllegalArgumentException("displayer can't be null");
			this.displayer = displayer;
			return this;
		}
		/**
		 * ����DisplayImageOptions����
		 * @return
		 */
		public DisplayImageOptions build() {
			//��������builder�����ֶεķǿ��ж�
			return new DisplayImageOptions(this);
		}
	}
}
