#!/usr/bin/env groovy

def sampleData = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
def segmentSize = 2
def index = 0

while (index < sampleData.size()) {
  if (index + segmentSize > sampleData.size()) {
    println sampleData[index..sampleData.size() - 1]
    break
  }
  println sampleData[index..index+segmentSize - 1]
  index += segmentSize
}
