load("@rules_go//go:def.bzl", "go_binary", "go_library")


go_library(
    name = "fortune",
    srcs = glob(["fortune/*.go"]),
    visibility = ["//visibility:public"],
)

go_binary(
    name = "main",
    srcs = ["main.go"],
    deps = [":fortune"],
)
