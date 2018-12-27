package huynhhuuphuc.azncoder.com.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player1 = Player("Aaron", 10, 3200)
        player1.show()

        val redPotion = Loot("Red Potion", LootType.POTION, 3.5)
        player1.inventory.add(redPotion)

        println(player1)
    }
}
