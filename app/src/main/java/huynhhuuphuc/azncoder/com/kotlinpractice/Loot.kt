package huynhhuuphuc.azncoder.com.kotlinpractice

enum class LootType
{
    POTION, RING, ARMOR
}

class Loot(val name: String, val type:LootType, val price: Double = 0.0)  {

    override fun toString(): String {
        return "Name: $name is a(n) $type and is worth $$price."
    }
}