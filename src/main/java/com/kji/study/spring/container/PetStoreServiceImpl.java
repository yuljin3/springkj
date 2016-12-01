package com.kji.study.spring.container;

public class PetStoreServiceImpl implements PetStoreService {

	private JpaAccountDao accountDao;
	private ItemDao itemDao;
	
	public void setAccountDao(JpaAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public String getPet() {
		System.out.println(accountDao.getValue());
		System.out.println(itemDao.getValue());
		return "pets";
	}

}
