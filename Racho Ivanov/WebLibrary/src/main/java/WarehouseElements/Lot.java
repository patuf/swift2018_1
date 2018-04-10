package WarehouseElements;

import WarehouseExceptions.NotEnoughSpaceException;
import WarehouseExceptions.TooMuchWeightException;

import java.util.LinkedList;
import java.util.List;

public class Lot //implements Comparable<Lot>
{
	private final String name;
	private final float supportedWeight;
	private float currentLoad;
	private final float supportedVolume;
	private float availableVolume;
	private List<Item> items;

	public Lot(int id, String name, float supportedWeight, float supportedVolume)
	{
		this.name = name;
		this.supportedWeight = supportedWeight;
		this.currentLoad = 0;
		this.supportedVolume = supportedVolume;
		this.availableVolume = supportedVolume;
		this.items = new LinkedList<>();
	}

	public String getName()
	{
		return name;
	}

	public float getSupportedWeight()
	{
		return supportedWeight;
	}

	public float getCurrentLoad()
	{
		return currentLoad;
	}

	public float getSupportedVolume()
	{
		return supportedVolume;
	}

	public float getAvailableVolume()
	{
		return availableVolume;
	}

	public String toString()
	{
		return "Lot : " + this.name;
	}

	public boolean itemIsAddable(Item item) throws TooMuchWeightException, NotEnoughSpaceException
	{
		if (item.getWeight() + this.currentLoad > this.supportedWeight)
			throw new TooMuchWeightException(this, item);
		else if (this.availableVolume < item.getVolume())
			throw new NotEnoughSpaceException(this,item);
		else
			return true;
	}

	public boolean addItem(Item item) throws TooMuchWeightException, NotEnoughSpaceException
	{
		if(itemIsAddable(item))
		{
			this.currentLoad = -item.getWeight();
			this.availableVolume = -item.getVolume();
			items.add(item);
			return true;
		}
		return false;
	}
}