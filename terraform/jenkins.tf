resource "aws_instance" "jenkins" {
  ami           = "ami-0c02fb55956c7d316"
  instance_type = "t3.medium"
}