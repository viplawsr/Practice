package main

import (
	"fmt"
)
type Animal struct{
	foodEaten string
	Locomotion string
	spokenSound string
}

func(a Animal) Eat() string{
	return a.foodEaten
}
func(a Animal) Move() string{
	return a.Locomotion
}
func(a Animal) Speak() string{
	return a.spokenSound
}

func main() {
	cow := Animal{"grass", "walk", "moo"}
	bird := Animal{"worms", "fly", "peep"}
	snake := Animal{"mice", "slither", "hsss"}
	
	for i := 0; i >= 0; i++{
		fmt.Print("> ");
		var s string
		var s1 string
		fmt.Scan(&s)
		fmt.Scan(&s1)
		if s == "cow"{
			if s1 == "eat"{
				fmt.Println(cow.Eat())
			} else if s1 == "move"{
				fmt.Println(cow.Move())
			} else{
				fmt.Println(cow.Speak())
			}
		} else if s == "bird"{
			if s1 == "eat"{
				fmt.Println(bird.Eat())
			} else if s1 == "move"{
				fmt.Println(bird.Move())
			} else{
				fmt.Println(bird.Speak())
			}
		} else if s == "snake"{
			if s1 == "eat"{
				fmt.Println(snake.Eat())
			} else if s1 == "move"{
				fmt.Println(snake.Move())
			} else{
				fmt.Println(snake.Speak())
			}
		} else{
			break;
		}
		
	}
	
}