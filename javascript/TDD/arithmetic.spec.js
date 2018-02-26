/**
 * a function to add two numbers
 * @param {Number} a The first number to be added
 * @param {Number} b The second number to be added
 * @param {Number} c The sum of a and b
 */

// import code to be tested
const sum = require('./sum');

// specify what the library does
describe("An arithmetic library", () => {

	it("Can add two numbers", () => {

		expect(sum(3,4)).toBe(7);
		expect(sum(-3,4)).toBe(1);
	});
});