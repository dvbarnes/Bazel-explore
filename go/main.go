package main

import "fmt"
import "fortune"

func main() {
    fmt.Println("Hello, Bazel! 💚")
    fmt.Println(fortune.Get())
}