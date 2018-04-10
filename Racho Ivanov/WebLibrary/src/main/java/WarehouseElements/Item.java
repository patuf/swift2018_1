package WarehouseElements;

public class Item
{
	private final String name;
	private final float volume;
	private final float weight;
	private float price;
	private Lot lot;

	public Item( String name, float volume, float weight, float price)
	{
		this.name = name;
		this.volume = volume;
		this.weight = weight;
		this.price = price;
	}

	public Lot getLot()
	{
		return lot;
	}

	public void setLot(Lot lot)
	{
		this.lot = lot;
	}

	public String getName()
	{
		return name;
	}

	public float getVolume()
	{
		return volume;
	}

	public float getWeight()
	{
		return weight;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public String toString()
	{
		return "Item :" + this.name;
	}
}
