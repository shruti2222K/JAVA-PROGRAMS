function reverseWords(sentence) {
  // Split the sentence into words
  let words = sentence.split(" ");

  // Reverse each word
  let reversedWords = words.map(function(word) {
    return word.split("").reverse().join("");
  });

  // Join the reversed words back into a sentence
  let reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

// Get user input via prompt
let inputSentence = prompt("Enter a sentence:");
let reversedResult = reverseWords(inputSentence);
console.log(reversedResult);
