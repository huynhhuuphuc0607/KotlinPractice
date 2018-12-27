package huynhhuuphuc.azncoder.com.kotlinpractice

class Player(val name: String, var level: Int = 1, var score : Int = 0) {

    var weapon = Weapon ("Fist", 1)
    var inventory = ArrayList<Loot>()

    fun show()
    {
        println("""
            Name: $name
            Level: $level
            Score: $score
            Weapon: ${weapon.name}
            Damage: ${weapon.damage}
            """)
    }

    override fun toString(): String {
        return """
            Name: $name
            Level: $level
            Score: $score
            Weapon: ${weapon.name}
            Damage: ${weapon.damage}
            """
    }
}