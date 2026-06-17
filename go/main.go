package main

import "fmt"
import "go/fortune"

func main() {
    fmt.Println("Hello, Bazel! 💚")
    fmt.Println(fortune.Get())
}