#!/usr/bin/env groovy

def index = 0

def withWhile(segmentSize, sampleData, Closure code) {
  def index = 0
  while (index < sampleData.size()) {
    if (index + segmentSize > sampleData.size()) {
      code(sampleData[index..sampleData.size() - 1])
      break
    }
    code(sampleData[index..index+segmentSize - 1])
    index += segmentSize
  }
}


def sampleData = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
def segmentSize = 2

println "=== withWhile ==="
withWhile(3, sampleData) { println it }

println "=== collate ==="
sampleData.collate(3).each { println it }
