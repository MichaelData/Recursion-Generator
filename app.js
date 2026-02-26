const lawPool = [
  "Standard Physics",
  "Magic",
  "Mad Science",
  "Psionics",
  "Substandard Physics",
  "Exotic"
];

const levelBands = [
  { minLevel: 1, maxLevel: 2, lawCount: ["Standard Physics"], size: () => `${roll(1, 5000)} feet`, spark: () => "0%" },
  { minLevel: 3, maxLevel: 3, lawCount: 1, size: () => `${roll(1, 2)} miles`, spark: () => `${roll(1, 4)}%` },
  { minLevel: 4, maxLevel: 6, lawCount: [1, 2], size: () => `${roll(3, 120)} miles`, spark: () => `${roll(5, 35)}%` },
  { minLevel: 7, maxLevel: 10, lawCount: [1, 2, 3], size: () => `${roll(100, 2000)} miles`, spark: () => `${roll(25, 85)}%` }
];

const levelNode = document.getElementById("level");
const lawsNode = document.getElementById("laws");
const sizeNode = document.getElementById("size");
const sparkNode = document.getElementById("spark");
const generateButton = document.getElementById("generate-btn");

function roll(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function pickLawCount(rule) {
  if (Array.isArray(rule)) {
    return rule[Math.floor(Math.random() * rule.length)];
  }

  if (typeof rule === "number") {
    return rule;
  }

  return 1;
}

function pickUniqueLaws(count) {
  const pool = [...lawPool];
  const selected = [];

  while (selected.length < count && pool.length > 0) {
    const idx = Math.floor(Math.random() * pool.length);
    selected.push(pool.splice(idx, 1)[0]);
  }

  return selected;
}

function generateRecursion() {
  const level = roll(1, 10);
  const band = levelBands.find(({ minLevel, maxLevel }) => level >= minLevel && level <= maxLevel);

  if (!band) {
    return;
  }

  const lawCountRule = band.lawCount;
  const laws = Array.isArray(lawCountRule) || typeof lawCountRule === "number"
    ? pickUniqueLaws(pickLawCount(lawCountRule))
    : lawCountRule;

  levelNode.textContent = String(level);
  lawsNode.textContent = laws.join(", ");
  sizeNode.textContent = band.size();
  sparkNode.textContent = band.spark();
}

generateButton.addEventListener("click", generateRecursion);
generateRecursion();
