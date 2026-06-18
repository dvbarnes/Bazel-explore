load("@rules_python//python:py_binary.bzl", "py_binary")
load("@rules_python//python:py_library.bzl", "py_library")
load("@rules_python//python:py_test.bzl", "py_test")

py_library(
    name = "lib",
    srcs = ["lib.py"],
    deps = [
        "@pip//numpy",
    ],
)

py_binary(
    name = "bin",
    srcs = ["bin.py"],
    deps = [":lib"],
)

py_binary(
    name = "runfile",
    srcs = ["runfile.py"],
    data = ["//:runfile.txt"],
    deps = ["@rules_python//python/runfiles"],
)

py_test(
    name = "test",
    srcs = ["test.py"],
    deps = [
        ":lib"
    ]
)

filegroup(
    name = "srcs",
    srcs = ["BUILD"] + glob(["**/*.py"]),
    visibility = ["//examples:__pkg__"],
)