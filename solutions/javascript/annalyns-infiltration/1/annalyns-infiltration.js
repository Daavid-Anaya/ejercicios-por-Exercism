/**
 * The fast attack is available when the knight is sleeping
 *
 * @param {boolean} knightIsAwake
 *
 * @return {boolean} Whether or not you can execute a fast attack.
 */
export function canExecuteFastAttack(knightIsAwake) {
  return knightIsAwake !== true;
}

export function canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake) {
  return (knightIsAwake === true || archerIsAwake === true || prisonerIsAwake === true);
}

export function canSignalPrisoner(archerIsAwake, prisonerIsAwake) {
  return (archerIsAwake === false && prisonerIsAwake === true);
}

export function canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent) {
  return (archerIsAwake === false && petDogIsPresent === true) || (knightIsAwake === false && archerIsAwake === false && prisonerIsAwake === true && petDogIsPresent === false);
}
