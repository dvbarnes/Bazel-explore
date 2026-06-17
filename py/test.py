"""A tiny example binary for the native Python rules of Bazel."""

import unittest
from py import lib


class TestGetNumber(unittest.TestCase):

  def test_fib(self):
    self.assertEqual(lib.Fib(5), 8)

if __name__ == '__main__':
  unittest.main()