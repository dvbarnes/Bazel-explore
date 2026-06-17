load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/*.java"]),
        deps = [
        "@maven//:com_google_code_gson_gson"
    ],
    main_class = "com.example.ProjectRunner",
)