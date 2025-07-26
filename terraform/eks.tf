module "eks" {
  source          = "terraform-aws-modules/eks/aws"
  cluster_name    = "cart-eks"
  cluster_version = "1.27"
  subnets         = ["subnet-1", "subnet-2"]
  vpc_id          = "vpc-xxxx"

  node_groups = {
    eks_nodes = {
      desired_capacity = 2
      max_capacity     = 3
      min_capacity     = 1

      instance_type = "t3.medium"
    }
  }
}