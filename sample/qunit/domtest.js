$(document).ready(function() {

  module("Test with injected html");

  test("I can get the injected element", function() {
    var value = $("#injected");
    equal(value.size(), 1, "Ok, great!");
  });
});
